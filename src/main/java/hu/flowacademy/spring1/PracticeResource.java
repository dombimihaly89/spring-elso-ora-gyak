package hu.flowacademy.spring1;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api")
public class PracticeResource {

    private static final String NAME = "Misi";
    private static final String HOST_NAME = "misiPC";
    private static final String IP_ADDRESS = "192.168.5.154";
    List<Log> logList = new ArrayList<>();

    @GetMapping
    String getUserData() {
        return "My name is " + NAME + ", in " + HOST_NAME + "@" + IP_ADDRESS;
    }

    @PostMapping("/cube/{sideLength}")
    HullData postCube(@PathVariable int sideLength) {
        HullData response = new HullData();
        response.setSurface(sideLength * sideLength * 6);
        response.setVolume(sideLength * sideLength * sideLength);
        return response;
    }

    @PostMapping("/hull")
    HullData postHull(@RequestBody HullRequestDTO body) {
        HullData response = new HullData();
        if (body.getKind() == Kind.cone) {
            response.setSurface(0);
            response.setVolume(0);
            logList.add(new Log(response, body, System.currentTimeMillis()));
        } else if (body.getKind() == Kind.cube) {
            response.setSurface((body.getEdgeHorizontal() * body.getEdgeVertical()) * 6);
            response.setVolume(body.getEdgeHorizontal() * body.getEdgeVertical() * body.getEdgeVertical());
            logList.add(new Log(response, body, System.currentTimeMillis()));
        } else if (body.getKind() == Kind.prism) {
            response.setSurface(1);
            response.setVolume(1);
            logList.add(new Log(response, body, System.currentTimeMillis()));
        } else if (body.getKind() == Kind.cylinder) {
            response.setSurface(2);
            response.setVolume(2);
            logList.add(new Log(response, body, System.currentTimeMillis()));
        } else if (body.getKind() == Kind.sphere) {
            response.setSurface(3);
            response.setVolume(3);
            logList.add(new Log(response, body, System.currentTimeMillis()));
        } else {
            System.out.println("Hullrequest kind is not valid!");
        }
        return response;
    }

    @GetMapping("/logs/{intervall1}/{intervall2}")
    List getLogs(@PathVariable long intervall1, @PathVariable long intervall2 ) {
        return logList.stream().filter(x -> x.getTimeStamp() > intervall1).filter(x -> x.getTimeStamp() < intervall2).collect(Collectors.toList());
    }

    @GetMapping("/logs2/{limit}")
    List getLogs2(@PathVariable int limit) {
        if (logList.size() <= limit) {
            logList = IntStream.range(0, limit)
                    .mapToObj(x -> logList.toArray()[i])
                    .
        }
        return ;
    }

    @GetMapping("/log/{kind}")
    List showLogs(@PathVariable Kind kind) {

        return logList.stream().filter(x -> x.getHullRequestDTO().getKind().equals(kind)).collect(Collectors.toList());
        /*for (int i = 0; i < logList.size(); i++) {
            if (logList.get(i).getHullRequestDTO().getKind().equals(kind)) {
                return logList.get(i);
            }
        }
        return new Log();*/
    }



}




