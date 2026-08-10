# Change description parameter from String to Composable

The user wants to store UI logic (a Composable function) directly within the `AlgoProblem` data model. While this is technically possible, it changes how the data class is handled in terms of stability and equality.

## User Review Required

> [!IMPORTANT]
> Storing `@Composable` functions in a `data class` is generally discouraged because:
> 1. **Equality**: Two `AlgoProblem` objects with identical titles but different lambda instances will not be considered "equal".
> 2. **Separation of Concerns**: Data models should ideally hold data, while UI logic should reside in the Composable layer.
> 3. **Stability**: If the lambda captures unstable state, it might cause unnecessary recompositions.
>
> **Alternative**: Consider keeping `description` as a `String` (perhaps using Markdown or HTML for rich text) and using a separate Composable function to render it.

## Proposed Changes

### Data Model

#### [MODIFY] [AlgoProblem.kt](file:///Users/marcusabsher/AndroidStudioProjects/AlgoSolutionsApp/app/src/main/java/com/example/algosolutionsapp/data/model/AlgoProblem.kt)
- Change `description: String` to `description: @Composable () -> Unit`.
- Import `androidx.compose.runtime.Composable`.

## Verification Plan

### Automated Tests
- Run `analyze_file` on `AlgoProblem.kt` to ensure syntax correctness.
- Run `gradle_build("app:assembleDebug")` to ensure the project still compiles.

### Manual Verification
- None required as there are no usages yet.
