Feature: Project
  Scenario: Crear Actualizar Borrar usuario token
    When envio POST request a la /api/user.json con el Body
    """
      {
        "Email":"denisse@email.com",
        "FullName":"Denisse",
        "Password":"12345"
      }
      """
    Then El codigo de respuesta deberia ser 200
    And El expected body deberia ser
    """
    {
    "Id": "IGNORE",
    "Email": "denisse@email.com",
    "Password": null,
    "FullName": "Denisse",
    "TimeZone": 0,
    "IsProUser": false,
    "DefaultProjectId": "IGNORE",
    "AddItemMoreExpanded": false,
    "EditDueDateMoreExpanded": false,
    "ListSortType": 0,
    "FirstDayOfWeek": 0,
    "NewTaskDueDate": -1,
    "TimeZoneId": "Pacific Standard Time"
}
   """
    When envio PUT a /api/user/0.json con el user denisse@email.com y password 12345 con el Body
    """
    {
      "FullName":"Denisse123"
    }
    """
    Then El codigo de respuesta deberia ser 200
    And El atributo FullName deberia ser Denisse123
    When envio DELETE request a la /api/user/0.json con el Body
    """
    """
    Then El codigo de respuesta deberia ser 200
    And El atributo FullName deberia ser Denisse123
    And el progaram funciona con token