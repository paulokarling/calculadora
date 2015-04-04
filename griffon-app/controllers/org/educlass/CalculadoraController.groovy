package org.educlass

import griffon.core.artifact.GriffonController
import griffon.metadata.ArtifactProviderFor

@ArtifactProviderFor(GriffonController)
class CalculadoraController {
    CalculadoraModel model

    void click() {
        model.clickCount++
    }
}