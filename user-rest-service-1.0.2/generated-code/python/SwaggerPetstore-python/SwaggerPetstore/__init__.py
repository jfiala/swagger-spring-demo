#!/usr/bin/env python
"""Add all of the modules in the current directory to __all__"""
import os

# import models into package

from .models.user import User

from .models.showcase_datatype_primitives import ShowcaseDatatypePrimitives

from .models.category import Category

from .models.showcase_datatype_date import ShowcaseDatatypeDate

from .models.showcase_datatype_math import ShowcaseDatatypeMath

from .models.location import Location


# import apis into package

from .user_api import UserApi

from .search_api import SearchApi

from .userwithresponseentity_api import UserwithresponseentityApi

from .usercompletepostcomplete_api import UsercompletepostcompleteApi


# import ApiClient
from .swagger import ApiClient

__all__ = []

for module in os.listdir(os.path.dirname(__file__)):
  if module != '__init__.py' and module[-3:] == '.py':
    __all__.append(module[:-3])
