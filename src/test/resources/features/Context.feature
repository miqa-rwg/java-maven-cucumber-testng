Feature: context

  Scenario Outline: As a user, I want to check how context works1
    Given Using <key>, I put <value> in the context
    When Using <key>, I get value from the context
    And Using <key>, I update value in the context
    And Using <key>, I get value from the context
    And Using <key>, I remove value from the context

    Examples:
      | key     | value |
      | integer | 1     |
      | string  | text  |
      | boolean | true  |
      | float   | 12.24 |

  Scenario Outline: As a user, I want to check how context works2
    Given Using <key>, I put <value> in the context
    When Using <key>, I get value from the context
    And Using <key>, I update value in the context
    And Using <key>, I get value from the context
    And Using <key>, I remove value from the context

    Examples:
      | key     | value |
      | integer | 1     |
      | string  | text  |
      | boolean | true  |
      | float   | 12.24 |