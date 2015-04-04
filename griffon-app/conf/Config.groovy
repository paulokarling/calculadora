application {
    title = 'calculadora'
    startupGroups = ['calculadora']
    autoShutdown = true
}
mvcGroups {
    // MVC Group for "calculadora"
    'calculadora' {
        model      = 'org.educlass.CalculadoraModel'
        view       = 'org.educlass.CalculadoraView'
        controller = 'org.educlass.CalculadoraController'
    }
}