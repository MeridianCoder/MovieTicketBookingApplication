package meridiancoder.movieticketmanagement.entities;

import lombok.Data;

/**
 * Created by Sabi on 11/12/2019.
 */

@Data
public class TimeSlot {
    String id;
    long startTime;
    long endTime;
}
