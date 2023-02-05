package business.concretes;

import business.abstracts.AppointmentService;
import entities.concretes.Appointment;

import java.util.List;

public class AppointmentManager implements AppointmentService {

    @Override
    public Appointment getAppointment() {
        return null;
    }

    @Override
    public Appointment cancelAppointment() {
        return null;
    }

    @Override
    public List<Appointment> getAllAppointmentsList() {
        return null;
    }

    @Override
    public List<Appointment> getCompletedAppointmentsList() {
        return null;
    }

    @Override
    public List<Appointment> getContinuingAppointmentsList() {
        return null;
    }
}
