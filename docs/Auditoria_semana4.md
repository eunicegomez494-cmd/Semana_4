# Auditoría de Cohesión y Encapsulamiento (Semana 4)

## 1. Cohesión de la clase
La clase auditada cumple una única responsabilidad (representar la entidad de dominio y asegurar que sus datos de identificación no sean alterados). No mezcla lógica de persistencia, reportes ni cálculo externo.

## 2. Métodos de acceso y colecciones
Ningún getter expone colecciones de manera directa. En caso de manejar listas en el futuro, se aplicará una **copia defensiva** devolviendo `new ArrayList<>(lista)` para proteger el estado interno de la clase.

## 3. Atributos inmutables (`final`)
Se identificó que el atributo `placa` debe ser inmutable, ya que la identidad del vehículo no debe cambiar a lo largo de su ciclo de vida. Se declaró adecuadamente como `private final String placa;`.

## 4. Prioridad de corrección
La prioridad #1 de corrección fue asegurar que el estado inicial del objeto sea válido mediante el método de validación centralizada `validar(...)` antes de asignar los atributos en el constructor.