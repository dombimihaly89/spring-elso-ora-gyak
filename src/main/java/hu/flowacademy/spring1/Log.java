package hu.flowacademy.spring1;

public class Log {

    private HullData hullData;
    private HullRequestDTO hullRequestDTO;
    private long timeStamp;

    public Log() {
    }

    public Log(HullData hullData, HullRequestDTO hullRequestDTO, long timeStamp) {
        this.hullData = hullData;
        this.hullRequestDTO = hullRequestDTO;
        this.timeStamp = timeStamp;
    }

    public HullData getHullData() {
        return hullData;
    }

    public void setHullData(HullData hullData) {
        this.hullData = hullData;
    }

    public HullRequestDTO getHullRequestDTO() {
        return hullRequestDTO;
    }

    public void setHullRequestDTO(HullRequestDTO hullRequestDTO) {
        this.hullRequestDTO = hullRequestDTO;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
