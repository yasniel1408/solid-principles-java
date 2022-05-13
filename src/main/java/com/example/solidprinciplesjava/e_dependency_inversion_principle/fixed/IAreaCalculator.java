package com.example.solidprinciplesjava.e_dependency_inversion_principle.fixed;

import java.util.List;

public interface IAreaCalculator {
    double sum(List<IShape> shapes);
}
