@regression
Feature: Adding and Validating notes in NotePad


  @test @smoke
  Scenario Outline: Validate Notes
    Given Application is launched
    Then Add and Validate "<text>" notes and "<check>" notes
    Examples:
      | text | check |
#    |2   |0    |s
      | 1    | 1     |

  @ColorChange @smoke @sanity
  Scenario Outline: shift notes to different color and validate
    Given Application is launched
    Then Add Note with "<text>" text notes and "<check>" notes
    Then change color
    Examples:
      | text | check |
#    |2   |0    |
#    |0   |4    |
      | 1    | 1     |

  @colorDict @sanity
  Scenario Outline: Press ColorDict checkbox
    Given Application is launched
    Then Add Note with "<text>" text notes and "<check>" notes
    Then validate color dict
    Examples:
      | text | check |
      | 1    | 0     |

  @archiveTrash @sanity @smoke
  Scenario Outline: Adding notes to Archive and trash
    Given Application is launched
    Then Add Note with "<text>" text notes and "<check>" notes
    Then transfer note to "<option>" and validate
    Examples:
      | text | check | option  |
      | 1    | 0     | archive |
      | 1    | 0     | trash   |

  @searchNote @smoke
  Scenario Outline: Adding Notes and validate through Search Button
    Given Application is launched
    Then Add Note with "<text>" text notes and "<check>" notes
    Then Validate through search button
    Examples:
      | text | check |
      | 1    | 1     |

  @changeDefaultLayout
  Scenario Outline: Changing Homepage Screen of Notepad in Settings
    Given Application is launched
    Then Go to Settings and change layout to "<type>"
    Then validate "<type>" on homepage
    Examples:
      | type     |
      | calendar |

  @validateSort
  Scenario Outline: Validate Sorting of Notes by filtering
    Given Application is launched
    Then Add Note with "<text>" text notes and "<check>" notes
    Then Validate Notes "<filter>"
    Examples:
      | text | check | filter           |
      | 1    | 1     | alphabetically   |
#      | 1    | 1     | by modified time |
#      | 1    | 1     | by created time  |