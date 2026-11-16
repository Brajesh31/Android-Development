# 🗄️ Data and Database Scope

The current repository tree does not establish a backend or database integration. The Kotlin screens, adapters, and models appear to use local application data for their demonstrations.

## Current scope

- Models represent values consumed by UI screens.
- Adapters bind local collections into list rows.
- Activities coordinate user interaction and screen presentation.
- No database schema, migration files, server endpoint, or repository/data-source layer is established by the inspected project tree.

## If persistent storage is introduced

Choose a storage mechanism based on a real requirement. Document:
- Data model and ownership.
- Schema and migration strategy.
- Retention and deletion behaviour.
- Backup and restore implications.
- Sensitive-data classification.
- Encryption and access-control requirements.
- Error handling and offline behaviour.
- Tests for migration and data integrity.

Do not add a database simply to make the project appear more production-like. It should solve a real persistence requirement.
