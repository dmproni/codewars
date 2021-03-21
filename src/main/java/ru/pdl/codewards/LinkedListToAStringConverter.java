package ru.pdl.codewards;

public class LinkedListToAStringConverter {
  public static String stringify(LinkedListToAStringConverterNode list) {
    if (list == null) return "null";

    final var result = new StringBuilder();

    result.append(list.getData());
    var next = list.getNext();

    while (next != null) {
      result.append(" -> ");
      result.append(next.getData());
      next = next.getNext();
    }
    result.append(" -> null");

    return result.toString();
  }

}
