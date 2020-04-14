package com.zimek

import spock.lang.Specification

class SomethingTest extends Specification {

    def 'should return correct number' () {
        given:
        def factor = 5.0

        when:
        def something = new Something()
        def number = something.getMyNumber(factor)

        then:
        number == 25.0
    }
}
