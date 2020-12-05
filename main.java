public class Main {

    public static void main(String[] args) {
	// write your code
        /*
        1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
        2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        */
        byte bt = -127;
        int  nCount = 0;
        long nValue = 0L;
        double fDec = 13.44476543456E-27;  System.out.println(fDec);

        float a = 1/123f;
        float b = 200.0005f;
        float pi = 3.141518281828459046f;

        System.out.println("Method 1 ret: \t " + Metod_1(10f,20f,30E-4f,10.0001f));
        System.out.println("Method 2 ret: \t " + Metod_2(10,20));

        SayIsPositive(100);
        SayIsPositive(-1*100);
        SayHello("Bob");
        SayIsisokosniyGod(1848);
        SayIsisokosniyGod(1848+3);
        SayIsisokosniyGod(2020);
        SayIsisokosniyGod(400*7);
    }

    private static float Metod_1(float a, float b, float c, float d) throws IllegalArgumentException
    {
      //  3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – аргументы этого метода, имеющие тип float.
        if (d == 0)  throw new java.lang.IllegalArgumentException("arg. 'd' is zero !!!");;

        return a * (b+(c/d));
    }
    /*4. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false. */
    private static boolean Metod_2(int a, int b)
    {
        int x = (a+b);
        return (x >= 10 && x <= 20);
    }
    /*5. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    */
    private static void SayIsPositive(int nVal)
    {
        if (IsPositive(nVal)) System.out.println(nVal + " - positive");
        else                  System.out.println(nVal + " - Negative");
    }
    /* 6. Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    */
    private static Boolean IsPositive(int nVal)
    {
        return (nVal >=0 );
    }
    /* 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    */
    private static void SayHello(String sName)
    {
        System.out.println("Hi! " + sName + "...");
    }
    /*8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */
    private static Boolean IsisokosniyGod(int nYear)
    {
        return ((nYear % 400) == 0) || ((nYear % 4) == 0 && (nYear % 100) != 0);
    }
    private static void SayIsisokosniyGod(int nYear)
    {
       if (IsisokosniyGod(nYear))    System.out.println(nYear + "\t" + "високосный");
       else                          System.out.println(nYear + "\t" + "НЕ високосный");
    }

}
