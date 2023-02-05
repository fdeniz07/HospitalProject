package business.abstracts;

import entities.concretes.Appointment;

import java.util.List;

public interface AppointmentService {

     Appointment getAppointment();

     Appointment cancelAppointment();

     List<Appointment> getAllAppointmentsList();

     List<Appointment> getCompletedAppointmentsList();

     List<Appointment> getContinuingAppointmentsList();

}

