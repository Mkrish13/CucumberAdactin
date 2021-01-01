Feature: Verify the AdactinHotel login Details
  Scenario Outline: Verify the AdactinHotel login details with valid Credentials
    Given User is on the AdactinHotel Page
    When User should login using the Valid "<userName>" and "<password>"
    And User Should Selecthotel by Selecting "<location>" ,"<hotel>","<roomType>","<noOfRooms>"and Enter "<checkInDate>","<checkOutDate>" and Select"<adultCount>","<childrenCount>" and click Search button
    And User Should Select the Hotel and click Continue.
    And User Should Enter "<firstName>","<lastName>","<billingAddress>"and  enter Card Details
      | creditCardNo     | cardType         | expMon    | expYear | cvv |
      | 7894561230789456 | Master Card      | February  |    2022 | 456 |
      | 1254561230787589 | American Express | April     |    2021 | 852 |
      | 8523561230789573 | VISA             | September |    2021 | 103 |
      | 7536561230781101 | Other            | November  |    2022 | 809 |
    Then User Should booknow and Display OrderId
    Examples: 
      | userName | password | location | hotel          | roomType     | noOfRooms | checkInDate | checkOutDate | adultCount | childrenCount | firstName | lastName | billingAddress              |
      | Dummiezz | Dummy@13 | Sydney   | Hotel Sunshine | Super Deluxe | 8 - Eight | 05/12/2020  | 09/12/2020   | 3 - Three  | 3 - Three     | Muthu     | Krishnan | NO 5,34th Cross St, VH Road |
