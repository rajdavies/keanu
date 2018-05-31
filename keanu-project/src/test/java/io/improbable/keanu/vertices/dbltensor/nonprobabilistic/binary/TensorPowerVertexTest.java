package io.improbable.keanu.vertices.dbltensor.nonprobabilistic.binary;

import io.improbable.keanu.vertices.dbltensor.DoubleTensorVertex;
import org.junit.Test;

import static io.improbable.keanu.vertices.dbltensor.nonprobabilistic.binary.BinaryOperationTestHelpers.*;

public class TensorPowerVertexTest {

    @Test
    public void powerTwoScalarVertexValues() {
        operatesOnTwoScalarVertexValues(2.0, 3.0, 8.0, DoubleTensorVertex::power);
    }

    @Test
    public void calculatesDualNumberOfTwoScalarsPower() {
        calculatesDualNumberOfTwoScalars(2.0, 3.0, 3.*4., Math.log(2.)*8., DoubleTensorVertex::power);
    }

    @Test
    public void powerTwoMatrixVertexValues() {
        operatesOnTwo2x2MatrixVertexValues(
            new double[]{1.0, 2.0, 3.0, 4.0},
            new double[]{2.0, 3.0, 4.0, 5.0},
            new double[]{1.0, 8.0, 81.0, 1024.0},
            DoubleTensorVertex::power
        );
    }

    @Test
    public void calculatesDualNumberOfTwoMatricesElementWisePower() {
        calculatesDualNumberOfTwoMatricesElementWiseOperator(
            new double[]{1.0, 2.0, 3.0, 4.0},
            new double[]{2.0, 3.0, 4.0, 5.0},
            new double[]{2.0, 3.0*4, 4.0*27, 5.0*256},
            new double[]{Math.log(1.0)*1, Math.log(2.0)*8, Math.log(3.0)*81, Math.log(4.0)*1024},
            DoubleTensorVertex::power
        );
    }

}
