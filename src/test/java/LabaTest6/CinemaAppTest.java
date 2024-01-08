package LabaTest6;

import org.junit.jupiter.api.*;

import org.program.Laba6.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CinemaAppTest {
    int generateRandomInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    int[] generateRandomArray(int min, int max, int size) {
        int[] returnArray = new int[size];
        for (int i = 0; i < size; i++) {
            returnArray[i] = generateRandomInt(min, max);
        }
        return returnArray;
    }

    static int RowsCountGlobal = 10;
    static int SeatsCountGlobal = 20;
    static CinemaApp cinema = new CinemaApp(5, RowsCountGlobal, SeatsCountGlobal);

    @Test
    @Order(1)
    void bookSeats() {
        for (int i = 0; i < RowsCountGlobal; i++) {
            int[] seatsCount = generateRandomArray(0, SeatsCountGlobal - 1, SeatsCountGlobal);
            cinema.bookSeats(0, i, seatsCount);
        }
    }

    @Test
    @Order(2)
    void printSeatingArrangement() {
        cinema.printSeatingArrangement(0);
    }

    @Test
    @Order(3)
    void checkAvailability() {
        System.out.println(cinema.checkAvailability(0, 4));
    }

    @Test
    @Order(4)
    void cancelBooking() {
        int[] array = new int[SeatsCountGlobal];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        cinema.cancelBooking(0, 0, array);
    }

    @Test
    @Order(5)
    void printSeatingArrangement2() {
        cinema.printSeatingArrangement(0);
    }
}
