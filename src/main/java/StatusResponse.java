public enum StatusResponse {
    SUCCES ("SUCCES"),
    ERROR ("ERROR");

    private String status;


    StatusResponse(String status) {
        this.status=status;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
