# new feature
# Tags: optional

Feature: Mouritech API Challenge Test

  Background:
    * url 'http://api.giphy.com'

  Scenario Outline: Retrieve images for <q> with limit <limit>, offset <offset> and key <key>
    * def query = {q: <q>, key: <key>, limit: <limit>, offset: <offset>}
    Given path '/v1/gifs/search'
    And params query
    When method GET
    Then status 200
    Then print 'Endpoint hit!'
    Then print response
    * def images = response.data
    * print 'amount of images:' + images.length
    * assert images.length == limit

    Examples:
      | q               | limit       | offset       | key                                |
      | funny dog       | 5           | 0            | 263nPXmmpGtXBp5W7rnPsUJkT9UWjKTI   |
      | funny cat       | 2           | 1            | 263nPXmmpGtXBp5W7rnPsUJkT9UWjKTI   |
      | dolphin         | 1           | 0            | 263nPXmmpGtXBp5W7rnPsUJkT9UWjKTI   |