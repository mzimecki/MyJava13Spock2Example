package com.mzimecki


import spock.lang.Specification
import spock.lang.Unroll

class TextUtilsSpockTest extends Specification {

    @Unroll
    def 'should return text length' () {
        given:
        def textUtils = new TextUtils()

        when:
        def length = textUtils.getStringLength(text)

        then:
        length == expectedLength

        where:
        text     | expectedLength
        ""       | 0
        "one"    | 3
        "Hello"  | 5
        "Monday" | 6
    }

    def 'should throw exception for null text' () {
        given:
        def textUtils = new TextUtils()

        when:
        textUtils.getStringLength(null)

        then:
        thrown(IllegalArgumentException)
    }
}
