package trainticketbooking.model;

public class Train {

    String trainName;
    String trainId;
    String trainFromLocation;
    String trainToLocation;
    String trainTicketPrice;
    String trainSeatsAvailable;

    @Override
    public String toString() {
        return "Train{" +
                "trainName='" + trainName + '\'' +
                ", trainId='" + trainId + '\'' +
                ", trainFromLocation='" + trainFromLocation + '\'' +
                ", trainToLocation='" + trainToLocation + '\'' +
                ", trainTicketPrice='" + trainTicketPrice + '\'' +
                ", trainSeatsAvailable='" + trainSeatsAvailable + '\'' +
                '}';
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainFromLocation() {
        return trainFromLocation;
    }

    public void setTrainFromLocation(String trainFromLocation) {
        this.trainFromLocation = trainFromLocation;
    }

    public String getTrainToLocation() {
        return trainToLocation;
    }

    public void setTrainToLocation(String trainToLocation) {
        this.trainToLocation = trainToLocation;
    }

    public String getTrainTicketPrice() {
        return trainTicketPrice;
    }

    public void setTrainTicketPrice(String trainTicketPrice) {
        this.trainTicketPrice = trainTicketPrice;
    }

    public String getTrainSeatsAvailable() {
        return trainSeatsAvailable;
    }

    public void setTrainSeatsAvailable(String trainSeatsAvailable) {
        this.trainSeatsAvailable = trainSeatsAvailable;
    }
}
