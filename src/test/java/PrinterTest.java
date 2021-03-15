import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 200);
    }

    @Test
    public void hasPaper() {
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void canPrintIfEnoughPaper() {
        assertEquals(80, printer.print(2, 10));
    }

    @Test
    public void cannotPrintIfNotEnoughPaper() {
        Printer fewSheetsLeftPrinter = new Printer(5, 50);
        assertEquals(5, fewSheetsLeftPrinter.print(2, 10));
    }

    @Test
    public void hasTonerVolume() {
        assertEquals(200, printer.getTonerVolume());
    }

}
