#language: es
@PlatanitosTest
Característica: Login
  Yo como usuario
  Quiero tener una opción para iniciar sesión
  Para ver las ofertas y hacer pedido de un producto en oferta

#    @PlatanitosLogin
#    Escenario: Iniciar sesión
#      Dado que me encuentro en la página principal de Platanitos
#      Cuando haga click en Cuenta
#      Y inicio sesión con las credenciales email: "ener.jak@hotmail.com" y contraseña: "QALab2023?"
#      Entonces valido la autenticación y debería de aparecer el título de "Cuenta"
#
#    @PlatanitosSeleccionarProdDeOferta
#    Escenario: Seleccionar un producto de las Ofertas
#      Dado estoy en la página principal de Platanitos
#      Cuando hago click en Ofertas
#      Y selecciono la oferta principal
#      Y selecciono un Producto de las Ofertas
#      Entonces valido que debe aparecer el titulo de "Características"
#      Y tambien valido que aparesca el titulo "Categorías"
#      Entonces añado el producto al carrito
#      Y valido que el producto se añadio exitosamente dandole click en Carrito

  @PlatanitosLoginYSeleccionarProdOferta
  Escenario: Iniciar sesión
    Dado que me encuentro en la página principal de Platanitos
    Cuando haga click en Cuenta
    Y inicio sesión con las credenciales email: "ener.jak@hotmail.com" y contraseña: "QALab2023?"
    Entonces valido la autenticación y debería de aparecer el título de "Cuenta"
    Cuando hago click en Ofertas
    Y selecciono la oferta principal
    Y selecciono un Producto de las Ofertas
    Entonces valido que debe aparecer el titulo de "Características"
    Y tambien valido que aparesca el titulo "Categorías"
    Entonces añado el producto al carrito
    Y valido que el producto se añadio exitosamente dandole click en Carrito
