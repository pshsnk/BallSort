package by.innowise.enums;

import by.innowise.models.*;
import java.util.HashMap;
import java.util.Map;

public enum ClassOrder {
    BASKETBALL_BALL(BasketballBall.class),
    FOOTBALL_BALL(FootballBall.class),
    HANDBALL_BALL(HandballBall.class),
    TENNIS_BALL(TennisBall.class),
    VOLLEYBALL_BALL(VolleyballBall.class);

    private Class clazz;

    ClassOrder(Class clazz) {
        this.clazz=clazz;
    }

    private static final Map<Class, ClassOrder> map;

    static {
        map = new HashMap<Class,ClassOrder>();
        for (ClassOrder order : ClassOrder.values()) {
            map.put(order.clazz, order);
        }
    }
    public static ClassOrder findByKey(Class clazz) {
        return map.get(clazz);
    }

}
