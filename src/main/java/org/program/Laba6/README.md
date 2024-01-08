# JavaLabs
Класс CinemaApp

Конструктор:
    
    public CinemaApp(int hallsCount, int rowsCount, int seatsCount)

    • hallsCount - кол-во залов;
    • rowsCount - кол-во рядов;
    • seatsCount - кол-во сидений

Метод для бронирования мест:

    bookSeats(int hallNumber, int row, int[] seatsToBook, boolean sayIfBooked)

    sayIfBooked - "переключатель" вывода в консоли сообщения об забронированости места

Перегрузка метода:

    public void bookSeats(int hallNumber, int row, int[] seatsToBook) {
    bookSeats(hallNumber, row, seatsToBook, false);
    }

Отмена бронирования мест:

    public void cancelBooking(int hallNumber, int row, int[] seatsToCancel)

Проверка доступности мест:

    public boolean checkAvailability(int screen, int numSeats)

Вывод в консоль всех занятых (1) и не занятых (0) мест в зале:

    public void printSeatingArrangement(int hallNumber)
