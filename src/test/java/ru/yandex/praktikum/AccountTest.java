package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String checkName;
    private final boolean expectedResult;

    public AccountTest(String checkName, boolean expectedResult) {
            this.checkName = checkName;
            this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][] {
            //длина имени 10,3,19,4,18 позитивные проверки
            {"Джон Старк", true},
            {"а и",true},
            {"Серрсея Ланнисстерр",true},
            {"До д",true},
            {"Иона Бурерожденная",true},
            //2,20 негативные проверки
            {"Иа",false},
            {"Арияробертсанс Старк",false},
            //Имя не заполнено
            {"",false},
            //Имя состоит из пробелов
            {"   ",false},
            //Имя без пробела внутри строки
            {"ТирионЛанистер",false},
            //Имя без пробела внутри строки
            {"Тирион Ланис tер",false}

        };
    }
    @Test
    public void checkBoundaryValuesAndCountSpaces(){
        Account account = new Account(checkName);
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult,actualResult);
    }

}




