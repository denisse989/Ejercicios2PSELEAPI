Feature: Project
  Scenario: Crear Actualizar Borrar projecto
    Given yo uso la Authenticacion por token 2
    When Envio POST request a la /api/projects.json con el body
      """
      {
        "Content":"Cucumber",
        "Icon":"4"
      }
      """
    Then el codigo de Respuesta deberia ser 200
    And el expected Body deberia ser
    """
    {
        "Id": "IGNORE",
        "Content": "Cucumber",
        "ItemsCount": 0,
        "Icon":4,
        "ItemType": 2,
        "ParentId": null,
        "Collapsed": false,
        "ItemOrder": "IGNORE",
        "Children": [
        ],
        "IsProjectShared": false,
        "ProjectShareOwnerName": null,
        "ProjectShareOwnerEmail": null,
        "IsShareApproved": false,
        "IsOwnProject": true,
        "LastSyncedDateTime": "IGNORE",
        "LastUpdatedDate": "IGNORE",
        "Deleted": false,
        "SyncClientCreationId": null
    }
    """
    And Guardo el Id de la Respuesta en ID_PROJ
    When envio PUT a /api/projects/ID_PROJ.json con auth basica con el body
      """
      {
        "Content":"Cucumber2"
      }
      """
    Then el codigo de Respuesta deberia ser 200
    And el Atributo Content deberia ser Cucumber2
    When envio DELETE a /api/projects/ID_PROJ.json con auth Token con el body
      """
      """
    Then el codigo de Respuesta deberia ser 200
    And el Atributo Content deberia ser Cucumber2