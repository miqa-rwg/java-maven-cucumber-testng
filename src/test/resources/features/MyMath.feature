Feature: sum method

  Scenario Outline: As a user, I want to check sum method1
    Given I sum numbers <a> and <b>
    When I get result equals <sum>

    Examples:
      | a  | b  | sum |
      | 1  | 2  | 3   |
      | 2  | 3  | 5   |
      | 0  | 0  | 0   |
      | -1 | 1  | 0   |
      | 2  | -3 | -1  |
      | -2 | 1  | -1  |

  Scenario Outline: As a user, I want to check sum method2
    Given I sum numbers <a> and <b>
    When I get result equals <sum>

    Examples:
      | a  | b  | sum |
      | 1  | 2  | 3   |
      | 2  | 3  | 5   |
      | 0  | 0  | 0   |
      | -1 | 1  | 0   |
      | 2  | -3 | -1  |
      | -2 | 1  | -1  |