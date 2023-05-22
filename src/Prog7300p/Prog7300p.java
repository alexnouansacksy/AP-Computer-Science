package Prog7300p;

import java.util.Arrays;

public class Prog7300p {
    public static void main(String[] args) {
        // Test Perceptron using AND dataset
        double[][] X_train = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        double[] y_train = {0, 0, 0, 1};

        System.out.println("AND Neuron:");
        var model = new Perceptron(0.1, 15);
        model.fit(X_train, y_train);

        // Predict using the trained model
        double[] y_pred = model.predict(X_train);
        System.out.println("Prediction: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // Print weights and biases
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());


        // Make neurons for OR, NOT, NAND, and NOR

        // NOT dataset
        X_train = new double[][]{
                {0},
                {1}
        };
        y_train = new double[]{1, 0};
    }
}
/*
AND Neuron:
Epoch 1: Loss: 0.75
Epoch 2: Loss: 1.0
Epoch 3: Loss: 0.75
Epoch 4: Loss: 0.75
Epoch 5: Loss: 0.75
Epoch 6: Loss: 0.75
Epoch 7: Loss: 0.75
Epoch 8: Loss: 0.75
Epoch 9: Loss: 0.25
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Prediction: [0.0, 0.0, 0.0, 1.0]
Actual: [0.0, 0.0, 0.0, 1.0]
Weights: [0.17919056624765753, 0.11824567748414566]
Bias: -0.19999999999999987

Process finished with exit code 0

 */