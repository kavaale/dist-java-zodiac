package edu.wctc.distjavazodiac.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.wctc.distjavazodiac.entity.Month;
import edu.wctc.distjavazodiac.repo.MonthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BasicMonthListService implements MonthListService {
    private MonthRepo monthRepo;

    @Autowired
    public BasicMonthListService(MonthRepo mr) {
        this.monthRepo = mr;
    }

    @Override
    public List<Month> getMonths() {
        List<Month> months = new ArrayList<>();
        monthRepo.findAll().forEach(months::add);
        return months;
    }
}
