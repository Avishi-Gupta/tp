package seedu.address.model.appointment;

public class Appointment {
    private String patientName;
    private String doctorName;
    private String dateTime;

    public Appointment(String dateTime, String doctorName, String patientName) {
        this.dateTime = dateTime;
        this.doctorName = doctorName;
        this.patientName = patientName;
    }

    public String getPatName() {
        return this.patientName;
    }

    public String getDocName() {
        return this.doctorName;
    }

    public String getStart() {
        return this.dateTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Appointment) {
            return this.patientName.equals(((Appointment) obj).getPatName())
                    && this.dateTime.equals(((Appointment) obj).getStart());
        } else {
            return false;
        }
    }

}
