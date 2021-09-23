package Helpers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataHelper {

    public static String PegarDataHojeAdicionarDias(long dias) {
        LocalDate hoje = LocalDate.now().plusDays(dias);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        return hoje.format(formatter);
    }
}
