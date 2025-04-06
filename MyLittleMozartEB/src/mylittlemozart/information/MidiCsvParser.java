package mylittlemozart.information;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MidiCsvParser {

    public static List<MidiEventData> parseCsv(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
}}