fun containsEven(collection: Collection<Int>): Boolean =
        // it키워드를 사용해 객체 변수를 참조할 수 있음
        collection.any { it % 2 == 0 }
