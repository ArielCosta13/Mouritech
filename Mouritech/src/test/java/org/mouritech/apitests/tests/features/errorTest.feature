# new feature
# Tags: optional


Feature: Mouritech API Challenge Error test

    Scenario: Given banned key:  dc6zaTOxFJmzC
        * def query = {q: "funny dog", key: "dc6zaTOxFJmzC"}
        Given url 'http://api.giphy.com/v1/gifs/search'
        And params query
        When method GET
        Then status 403
        Then print 'Endpoint 403 error!'
