package business.abstracts;

import entities.concretes.Appointment;

import java.util.List;

public interface AppointmentService {

     Appointment createAppointment();

     Appointment getAppointment(String id);

     Appointment cancelAppointment(String id);

     List<Appointment> getAllAppointmentsList();

     List<Appointment> getCompletedAppointmentsList();

     List<Appointment> getContinuingAppointmentsList();

}

