package edu.cursor.task14_spring_data.controller;

import edu.cursor.task14_spring_data.tableInitializer.InitTables;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class InitTablesController {
    private InitTables initTables;

    @GetMapping("/init_tables")
    public void initTables() {
        initTables.initiateH2tables();
    }
}
