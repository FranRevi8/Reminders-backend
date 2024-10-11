package com.example.demo;

import com.example.demo.model.Reminder;
import com.example.demo.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ReminderRepository reminderRepository;

    @Override
    public void run(String... args) throws Exception{
        Reminder reminder1 = new Reminder();
        reminder1.setName("Hacer la compra");
        reminder1.setType("personal");
        reminder1.setState(true);
        reminder1.setTime(LocalDateTime.of(2024, 10, 9, 15, 30));
        reminderRepository.save(reminder1);

        Reminder reminder2 = new Reminder();
        reminder2.setName("Cena de empresa");
        reminder2.setType("trabajo");
        reminder2.setState(true);
        reminder2.setTime(LocalDateTime.of(2024, 10, 10, 10, 0));
        reminderRepository.save(reminder2);

        Reminder reminder3 = new Reminder();
        reminder3.setName("Llamar al dentista");
        reminder3.setType("personal");
        reminder3.setState(false);
        reminder3.setTime(LocalDateTime.of(2024, 10, 10, 12, 30));
        reminderRepository.save(reminder3);

        Reminder reminder4 = new Reminder();
        reminder4.setName("Reunión de trabajo");
        reminder4.setType("trabajo");
        reminder4.setState(false);
        reminder4.setTime(LocalDateTime.of(2024, 10, 9, 16, 0));
        reminderRepository.save(reminder4);

        Reminder reminder5 = new Reminder();
        reminder5.setName("Ir al gimnasio");
        reminder5.setType("salud");
        reminder5.setState(true);
        reminder5.setTime(LocalDateTime.of(2024, 10, 11, 18, 0));
        reminderRepository.save(reminder5);

        Reminder reminder6 = new Reminder();
        reminder6.setName("Revisar el coche");
        reminder6.setType("otros");
        reminder6.setState(false);
        reminder6.setTime(LocalDateTime.of(2024, 10, 12, 9, 0));
        reminderRepository.save(reminder6);

        Reminder reminder7 = new Reminder();
        reminder7.setName("Llamar a mamá");
        reminder7.setType("personal");
        reminder7.setState(true);
        reminder7.setTime(LocalDateTime.of(2024, 10, 13, 14, 15));
        reminderRepository.save(reminder7);

        Reminder reminder8 = new Reminder();
        reminder8.setName("Enviar el informe mensual");
        reminder8.setType("trabajo");
        reminder8.setState(false);
        reminder8.setTime(LocalDateTime.of(2024, 10, 14, 11, 30));
        reminderRepository.save(reminder8);

        Reminder reminder9 = new Reminder();
        reminder9.setName("Comprar un regalo de cumpleaños");
        reminder9.setType("personal");
        reminder9.setState(true);
        reminder9.setTime(LocalDateTime.of(2024, 10, 15, 10, 0));
        reminderRepository.save(reminder9);

        Reminder reminder10 = new Reminder();
        reminder10.setName("Revisión de proyecto");
        reminder10.setType("trabajo");
        reminder10.setState(false);
        reminder10.setTime(LocalDateTime.of(2024, 10, 16, 16, 0));
        reminderRepository.save(reminder10);

        Reminder reminder11 = new Reminder();
        reminder11.setName("Preparar la presentación");
        reminder11.setType("trabajo");
        reminder11.setState(true);
        reminder11.setTime(LocalDateTime.of(2024, 10, 17, 9, 0));
        reminderRepository.save(reminder11);

        Reminder reminder12 = new Reminder();
        reminder12.setName("Cita médica");
        reminder12.setType("salud");
        reminder12.setState(false);
        reminder12.setTime(LocalDateTime.of(2024, 10, 18, 11, 0));
        reminderRepository.save(reminder12);

        Reminder reminder13 = new Reminder();
        reminder13.setName("Comprar ingredientes para la pasta");
        reminder13.setType("personal");
        reminder13.setState(true);
        reminder13.setTime(LocalDateTime.of(2024, 10, 19, 17, 0));
        reminderRepository.save(reminder13);

        Reminder reminder14 = new Reminder();
        reminder14.setName("Clases de yoga");
        reminder14.setType("salud");
        reminder14.setState(true);
        reminder14.setTime(LocalDateTime.of(2024, 10, 20, 8, 30));
        reminderRepository.save(reminder14);

        Reminder reminder15 = new Reminder();
        reminder15.setName("Leer un libro");
        reminder15.setType("otros");
        reminder15.setState(true);
        reminder15.setTime(LocalDateTime.of(2024, 10, 21, 19, 0));
        reminderRepository.save(reminder15);

        Reminder reminder16 = new Reminder();
        reminder16.setName("Hacer limpieza de casa");
        reminder16.setType("otros");
        reminder16.setState(false);
        reminder16.setTime(LocalDateTime.of(2024, 10, 22, 10, 30));
        reminderRepository.save(reminder16);

        Reminder reminder17 = new Reminder();
        reminder17.setName("Organizar fotos");
        reminder17.setType("otros");
        reminder17.setState(true);
        reminder17.setTime(LocalDateTime.of(2024, 10, 23, 15, 0));
        reminderRepository.save(reminder17);

        Reminder reminder18 = new Reminder();
        reminder18.setName("Película: El Hoyo");
        reminder18.setType("otros");
        reminder18.setState(false);
        reminder18.setTime(LocalDateTime.of(2024, 10, 24, 20, 45));
        reminderRepository.save(reminder18);

    }
}
