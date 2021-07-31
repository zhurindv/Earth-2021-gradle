package jdev.dto;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Дмитрий on 31.07.2021.
 */
public class PointDTOTest {

    @Test
    public void toJson() throws Exception {
        PointDTO point = new PointDTO();
        point.setLat(56);
        point.setLon(74);
        point.setAutoId("o567gfd");
        assertTrue(point.toJson().contains("\"lat\":56"));
    }
}
