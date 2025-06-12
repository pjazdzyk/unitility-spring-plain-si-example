package com.synerset.unitility.spring.examples;

import com.synerset.unitility.unitsystem.common.Angle;
import com.synerset.unitility.unitsystem.common.Distance;
import com.synerset.unitility.unitsystem.common.Mass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
public class DefaultUnitsController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @GetMapping("/mesh-element/{mass}")
    public MeshElement getMeshElementByPathParamExample(@PathVariable("mass") Mass mass) {
        // Delegate to service, processing
        MeshElement meshElement = new MeshElement();
        meshElement.setId(1);
        meshElement.setMass(mass);
        meshElement.setAzimuth(Angle.ofDegrees(90));
        meshElement.setLength(Distance.ofKilometers(1));
        return meshElement;
    }

    @GetMapping("/mesh-element")
    public MeshElement getMeshElementByQueryParamExample(@RequestParam("mass") Mass mass) {
        // Delegate to service, processing
        MeshElement meshElement = new MeshElement();
        meshElement.setId(1);
        meshElement.setMass(mass);
        meshElement.setAzimuth(Angle.ofDegrees(90));
        meshElement.setLength(Distance.ofKilometers(1));
        return meshElement;
    }

    @PostMapping("/mesh-element")
    public MeshElement getMeshElementByRequestBody(@RequestBody MeshElement meshElement) {
        // Delegate to service, processing
        logger.info(meshElement.toString());
        return meshElement;
    }

}