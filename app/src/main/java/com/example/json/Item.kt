package com.example.json

data class Item(
    val id: String,
    val projectId: String,
    val equipmentId: String,
    val status: String,
    val requestedBy: String,
    val acceptedBy: Any?,
    val author: String,
    val category: String,
    val locations: ItemLocations,
    val filters: List<ItemFilters>,
    val type: String,
    val organization: String,
    val address: String,
    val startDate: String,
    val endDate: String,
    val description: Any?,
    val prolongDates: List<Any>,
    val releaseDates: List<Any>,
    val isDummy: Boolean,
    val hasDriver: Boolean,
    val overwriteDate: Any?,
    val metaInfo: Any?,
    val warehouseId: Any?,
    val rentalDescription: Any?,
    val internalTransportations: ItemInternalTransportations,
    val startDateMilliseconds: Double,
    val endDateMilliseconds: Double,
    val equipment: ItemEquipment,
)

data class ItemLocations(
    val type: String,
    val coordinates: List<Double>
)

data class ItemFilters(
    val name: String,
    val Vma: ItemFiltersValue
)

data class ItemFiltersValue(
    val max: Double,
    val min: Double
)

data class ItemInternalTransportations(
    val id: String,
    val projectRequestId: String,
    val pickUpDate: String,
    val deliveryDate: String,
    val description: Any?,
    val status: String,
    val startDateOption: Any?,
    val endDateOption: Any?,
    val pickUpLocation: ItemInternalTransportationsPickUpLocation,
    val deliveryLocation: ItemInternalTransportationsDeliveryLocation,
    val provider: String,
    val pickUpLocationAddress: String,
    val deliveryLocationAddress: String,
    val pGroup: String,
    val isOrganizedWithoutSam: Any?,
    val templatePGroup: String,
    val pickUpDateMilliseconds: Double,
    val deliveryDateMilliseconds: Double,
    val startDateOptionMilliseconds: Any?,
    val endDateOptionMilliseconds: Any?,
)

data class ItemInternalTransportationsPickUpLocation(
    val type: String,
    val coordinates: List<Double>
)

data class ItemInternalTransportationsDeliveryLocation(
    val type: String,
    val coordinates: List<Double>
)

data class ItemEquipment(
    val id: String,
    val title: String,
    val invNumber: String,
    val categoryId: String,
    val modelId: String,
    val brandId: String,
    val year: Double,
    val specifications: List<KeyValue>,
    val weight: Double,
    val additional_specifications: Any?,
    val structureId: String,
    val organizationId: String,
    val beaconType: Any?,
    val beaconId: String,
    val beaconVendor: String,
    val RFID: Double,
    val dailyPrice: Any?,
    val inactive: Any?,
    val tag: ItemEquipmentTag,
    val telematicBox: Any?,
    val createdAt: String,
    val special_number: Any?,
    val last_check: String,
    val next_check: String,
    val responsible_person: Any?,
    val test_type: Any?,
    val unique_equipment_id: String,
    val bgl_number: String,
    val serial_number: Any?,
    val inventory: Any?,
    val warehouseId: String,
    val trackingTag: Any?,
    val workingHours: Any?,
    val navaris_criteria: Any?,
    val dont_send_to_as400: Boolean,
    val model: ItemEquipmentModel,
    val brand: ItemEquipmentBrand,
    val category: ItemEquipmentCategory,
    val structure: ItemEquipmentStructure,
    val wareHouse: Any?,
    val equipmentMedia: List<ItemEquipmentEquipmentMedia>,
    val telematics: List<ItemEquipmentTelematics>,
    val isMoving: Boolean
)

data class KeyValue(
    val key: String,
    val value: Any
)

data class ItemEquipmentTag(
    val data: String,
    val authorName: String,
    val media: List<Any>
)

data class ItemEquipmentModel(
    val id: String,
    val name: String,
    val createdAt: String,
    val brand: ItemEquipmentBrand,
)

data class ItemEquipmentBrand(
    val id: String,
    val name: String,
    val createdAt: String,
)

data class ItemEquipmentCategory(
    val id: String,
    val name: String,
    val name_de: String,
    val createdAt: String,
    val media: List<Any>
)

data class ItemEquipmentStructure(
    val id: String,
    val name: String,
    val type: String,
    val color: String,
)

data class ItemEquipmentEquipmentMedia(
    val id: String,
    val name: String,
    val files: List<ItemEquipmentEquipmentMediaFiles>,
    val type: String,
    val modelId: String,
    val main: Boolean,
    val modelType: String,
    val createdAt: String,
)

data class ItemEquipmentEquipmentMediaFiles(
    val size: String,
    val path: String,
)

data class ItemEquipmentTelematics(
    val timestamp: String,
    val eventType: String,
    val projectId: String,
    val equipmentId: String,
    val locationName: String,
    val location: ItemEquipmentTelematicsLocation,
    val costCenter: String,
    val lastLatitude: String,
    val lastLongitude: String,
    val lastLatLonPrecise: Boolean,
    val lastAddressByLatLon: String,
)

data class ItemEquipmentTelematicsLocation(
    val type: String,
    val coordinates: List<List<List<List<Double>>>>,
)