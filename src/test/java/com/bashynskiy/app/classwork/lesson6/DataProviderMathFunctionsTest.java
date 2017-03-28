package com.bashynskiy.app.classwork.lesson6;

import com.bashynskiy.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by testu on 3/21/2017.
 */

//анатация для запуска параметров файла
@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFunctionsTest {
    @Test
    // фаил параметров
    @FileParameters(value = "src/test/resources/testdata.csv", mapper = CsvWithHeaderMapper.class)
    //метод
    public void dataProviderTestAdd(double argA, double argB, int expOut) {
        Assert.assertEquals(expOut, MathFunc.multiply(argA, argB), 0);
    }
    public class DataProviderMathSum {
        @Test
        @FileParameters(value = "src/test/resources/testdata2.csv", mapper = CsvWithHeaderMapper.class)
        public void dataProviderTestAdd(double argA, double argB, int expOut) {
            Assert.assertEquals(expOut, MathFunc.sum(argA, argB), 0);
        }
    }

}
