  @Demoblaze
  Feature: Pruebas a la pagina de Demoblaze
  #Con el objetivo de comprobar el conocimiento de automatizacion
  #Como Consubanco
  #Requiero realizar las valiaciones E2E de la pagina demoblaze

  @id:1 @RegistroWeb
  Scenario Outline: T-E2E-WEB-CA1- Registro en la web
    Given que el usuario ingresa a la url demoblaze
    When ingresa a la opcion signup e ingresa los datos "<user>" y "<password>"
    Then el sistema le debe dejar registrase correctamente
    Examples:
      |user|password|
      |vanerodr|v4n3ss4|

  @id:2 @LoginWeb   @id:3 @ValidacionUsuario
  Scenario Outline: T-E2E-WEB-CA2- Login en la web
    Given que el usuario con una cuenta creada ingresa a demoblaze
    When ingresa a la opcion login e ingresa "<user>" y "<password>"
    Then se puede visualizar el "<user>" en la esquina derecha
    Examples:
      |user|password|
      |vanerodr|v4n3ss4|

  @id:4 @ListaTelefonos
  Scenario: T-E2E-WEB-CA4- Lista de Telefonos
    Given que el usuario con una cuenta creada ingresa a demoblaze
    When ingresa a la opcion login e ingresa "<user>" y "<password>"
    And da clic en categoria phone
    Then el sistema le debe presentar la lista de phone
    Examples:
      |user|password|
      |vanerodr|v4n3ss4|
    
  @id:5 @VisualizarDescripcion
  Scenario Outline: T-E2E-WEB-CA5- Visualizar Descripcion del Producto
    Given que el usuario con una cuenta creada ingresa a demoblaze
    When ingresa a la opcion login e ingresa "<user>" y "<password>"
    And da clic en categoria phone
    And da clic en Samsug galaxy Sseis
    Then el sistema le debe presentar el label Product description
    Examples:
      |user|password|
      |vanerodr|v4n3ss4|

  @id:6 @VisualizarProductoAnanido
  Scenario Outline: T-E2E-WEB-CA6- Visualizar Producto Adicionado
    Given que el usuario con una cuenta creada ingresa a demoblaze
    When ingresa a la opcion login e ingresa "<user>" y "<password>"
    And da clic en categoria phone
    And da clic en Samsug galaxy Sseis
    And da clic en add to cart
    Then el sistema le debe presentar el modal con el mensaje Product added
    Examples:
      |user|password|
      |vanerodr|v4n3ss4|


  @id:7 @VisualizarCarrito
  Scenario Outline: T-E2E-WEB-CA7- Visualizar Carrito
    Given que el usuario con una cuenta creada ingresa a demoblaze
    When ingresa a la opcion login e ingresa "<user>" y "<password>"
    And da clic en categoria phone
    And da clic en Samsug galaxy Sseis
    And da clic en add to cart
    And da clic en ver carrito
    Then el sistema le debe presentar el producto en el carrito de compras
    Examples:
      |user|password|
      |vanerodr|v4n3ss4|


    @id:8 @EliminarProducto
  Scenario Outline: T-E2E-WEB-CA8- Eliminar Producto
      Given que el usuario con una cuenta creada ingresa a demoblaze
      When ingresa a la opcion login e ingresa "<user>" y "<password>"
      And da clic en categoria phone
      And da clic en Samsug galaxy Sseis
      And da clic en add to cart
      And da clic en ver carrito
    And da clic en borrar producto
    Then el sistema debe permitir borrar el producto
      Examples:
        |user|password|
        |vanerodr|v4n3ss4|

  @id:9 @LogOut
  Scenario Outline: T-E2E-WEB-CA9- LogOut
    Given que el usuario con una cuenta creada ingresa a demoblaze
    When ingresa a la opcion login e ingresa "<user>" y "<password>"
    And da clic en LogOut
    Then el sistema debe cerrar sesion
    And redirecciona a la página principal
    Examples:
      |user|password|
      |vanerodr|v4n3ss4|


