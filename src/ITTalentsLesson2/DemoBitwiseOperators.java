package ITTalentsLesson2;

public class DemoBitwiseOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = x | 3;
        System.out.println(y);
        byte z =5;//00000101
        System.out.println(z&3);
        //00000101
        // &
        //00000011
        //----------
        //00000001
        //<< shift
        System.out.println(z<<1);
        //00001010 - най бързия начин да умножим по 2
        System.out.println(z>>1);//целочислено делене на 5
        System.out.println("z<<3");//умножение по кратни на 2 ( тук е 2 на трета 8 )
        // ЗА ПРОВЕРКА НА ТОВА ДАЛИ ЕДИН БИТ Е ДИГНАТ ГО УМНОЖАВАМЕ ЛОГИЧЕСКИ (&) С ЧИСЛО НА КОЕТО Е ВДИГНАТ САМО СЪОТВЕТНИЯ БИТ
        //00001010 ИСКАМ ДА ПРОВЕРЯ ДАЛИ 4-ТИЯ БИТ Е ВДИГНАТ & 00001000
        byte number = 10;//00001010
        byte test = 8;

        System.out.println((number&test)==0);

    }
}
