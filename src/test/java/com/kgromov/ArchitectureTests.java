package com.kgromov;


import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.jmolecules.archunit.JMoleculesArchitectureRules;

@AnalyzeClasses(
        packagesOf = HexagonicalArchApplication.class,
        importOptions = ImportOption.DoNotIncludeTests.class
)
class ArchitectureTests {

    @ArchTest
    ArchRule jMoleculesLayers = JMoleculesArchitectureRules.ensureHexagonal();
}
