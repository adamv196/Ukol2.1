import com.engeto.hotel.Booking;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Guest guest1, guest2;
        Room room1, room2, room3;
        Booking reservation1, reservation2;


        guest1 = new Guest("Adela",
                "Malikova",LocalDate.of(1993,3,13));
        guest2 = new Guest("Jan"
                ,"Dvoracek", LocalDate.of(1995, 5,5));

        room1 = new Room(1, 1,true,
                true, BigDecimal.valueOf(1000));
        room2 = new Room(2, 1,true,
                true, BigDecimal.valueOf(1000));
        room3 = new Room(3, 3,false,
                true, BigDecimal.valueOf(2400));










    }
}