package org.program.Laba6;

public class CinemaApp {
    private int[][][] seats;

    public CinemaApp(int hallsCount, int rowsCount, int seatsCount) {
        seats = new int[hallsCount][rowsCount][seatsCount];
    }

    public void bookSeats(int hallNumber, int row, int[] seatsToBook) {
        bookSeats(hallNumber, row, seatsToBook, false);
    }

    public void bookSeats(int hallNumber, int row, int[] seatsToBook, boolean sayIfBooked) {
        for (int seat : seatsToBook) {
            if (seats[hallNumber][row][seat] == 0) {
                seats[hallNumber][row][seat] = 1;
            } else {
                if (sayIfBooked) {
                    System.out.println("Місце " + seat + " в ряду " + row + " у залі " + hallNumber + " вже заброньоване.");
                }
            }
        }
    }

    public void cancelBooking(int hallNumber, int row, int[] seatsToCancel) {
        for (int seat : seatsToCancel) {
            seats[hallNumber][row][seat] = 0;
        }
    }

    public boolean checkAvailability(int screen, int numSeats) {
        for (int row = 0; row < seats[screen].length; row++) {
            for (int seat = 0; seat <= seats[screen][row].length - numSeats; seat++) {
                boolean available = true;
                for (int i = 0; i < numSeats; i++) {
                    if (seats[screen][row][seat + i] == 1) {
                        available = false;
                        break;
                    }
                }
                if (available) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printSeatingArrangement(int hallNumber) {
        System.out.println("Схема розміщення місць для залу " + hallNumber + ":");

        for (int row = 0; row < seats[hallNumber].length; row++) {
            for (int seat = 0; seat < seats[hallNumber][row].length; seat++) {
                if (seats[hallNumber][row][seat] == 0) {
                    System.out.print("O ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }

}
