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

    }
}
