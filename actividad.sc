import java.util
import java.util.concurrent.ThreadLocalRandom
import java.util.stream.IntStream

object tareagrupal extends App{
  var numbers = IntStream.generate(() => ThreadLocalRandom.current.nextInt(10_000, 1_000_000)).distinct().limit(25).boxed.toList
  numbers.stream.forEach(System.out.println)
  // Listado de los números generados.
  println("==================================== Listado de los números generados ================================")
  println(numbers.stream().toList)

  // Cantidad de numeros:
  println("Numeros generados: " + numbers.size())

  // Listado de los números generados ordenados ascendente y descendentemente.
  println("==================================== Orden Descendente y Ascendente ================================")
  println("Lista Descendente:")
  var ArrayDescendente = numbers.stream().sorted().toArray()
  println(ArrayDescendente.mkString(","))
  println("Lista Ascendente:")
  var ArrayAscendente = ArrayDescendente.reverse
  println(ArrayAscendente.mkString(","))

  // Listado de los números generados que son pares
  println("==================================== Números generados que son pares ================================")
  val pares = numbers.stream().filter(x => x % 2 == 0)
  println(pares.toList)

  // Listado de los números generados que son impares
  println("==================================== Números generados que son impares ================================")
  val impares = numbers.stream().filter(x => x % 2 == 1)
  println(impares.toList)

  // Listado de los números generados que son primos
  println("==================================== Números generados que son primos ================================")
  val primo = numbers.stream().filter(n => (2 until n).forall(k => n % k != 0))
  println(primo.toList)

  // Listado de los números generados que son deficientes
  println("==================================== Números generados que son deficientes ================================")
  val deficientes = numbers.stream().filter(
    x => (1 to x-1).filter(d => x % d == 0).sum < x)
  println(deficientes.toList)

  // Listado de los números generados que son perfectos
  println("==================================== Números generados que son perfectos ================================")
  val perfectos = numbers.stream().filter(
    x => (1 to x-1).filter(d => x % d == 0).sum == x)
  println(perfectos.toList)

  // Listado de los números generados que son abundantes
  println("==================================== Números generados que son abundantes ================================")
  val abundante = numbers.stream().filter(
    x => (1 to x-1).filter(d => x % d == 0).sum > x)
  println(abundante.toList)
}
[8:14 p. m., 14/4/2022] Nixon: .........................
[8:14 p. m., 14/4/2022] Nixon: import java.util
import java.util.concurrent.ThreadLocalRandom
import java.util.stream.IntStream

  var numbers = IntStream.generate(() => ThreadLocalRandom.current.nextInt(10_000, 1_000_000)).distinct().limit(25).boxed.toList
  numbers.stream.forEach(System.out.println)
  // Listado de los números generados.
  println("==================================== Listado de los números generados ================================")
  println(numbers.stream().toList)

  // Cantidad de numeros:
  println("Numeros generados: " + numbers.size())

  // Listado de los números generados ordenados ascendente y descendentemente.
  println("==================================== Orden Descendente y Ascendente ================================")
  println("Lista Descendente:")
  var ArrayDescendente = numbers.stream().sorted().toArray()
  println(ArrayDescendente.mkString(","))
  println("Lista Ascendente:")
  var ArrayAscendente = ArrayDescendente.reverse
  println(ArrayAscendente.mkString(","))

  // Listado de los números generados que son pares
  println("==================================== Números generados que son pares ================================")
  val pares = numbers.stream().filter(x => x % 2 == 0)
  println(pares.toList)

  // Listado de los números generados que son impares
  println("==================================== Números generados que son impares ================================")
  val impares = numbers.stream().filter(x => x % 2 == 1)
  println(impares.toList)

  // Listado de los números generados que son primos
  println("==================================== Números generados que son primos ================================")
  val primo = numbers.stream().filter(n => (2 until n).forall(k => n % k != 0))
  println(primo.toList)

  // Listado de los números generados que son deficientes
  println("==================================== Números generados que son deficientes ================================")
  val deficientes = numbers.stream().filter(
    x => (1 to x-1).filter(d => x % d == 0).sum < x)
  println(deficientes.toList)

  // Listado de los números generados que son perfectos
  println("==================================== Números generados que son perfectos ================================")
  val perfectos = numbers.stream().filter(
    x => (1 to x-1).filter(d => x % d == 0).sum == x)
  println(perfectos.toList)

  // Listado de los números generados que son abundantes
  println("==================================== Números generados que son abundantes ================================")
  val abundante = numbers.stream().filter(
    x => (1 to x-1).filter(d => x % d == 0).sum > x)
  println(abundante.toList)
