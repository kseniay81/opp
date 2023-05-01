public class BonusMilesService {
    public int calculate(int price ) {
        int OneMiles = 20;
        int bonusMiles = price / OneMiles;
        return bonusMiles; // возвращаем расчитанное кол-во бонусов

    }
}
