#language: es
 Característica: Agregar producto al carrito
  Yo como usuario quiero seleccionar un producto para agregarlo al carrito.

  Escenario: Agregar producto al carrito exitosamente
    Dado que el usuario abre la pagina Haceb y busca los electrodomesticos de cocina
    Cuando el usuario le da click en el producto y le da click en comprar para agregar al carrito
    Entonces el usuario puede observar el resumen del carrito.